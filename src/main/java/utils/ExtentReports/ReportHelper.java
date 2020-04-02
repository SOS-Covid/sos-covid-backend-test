package utils.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.service.ExtentService;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReportHelper {

    public static final String UTF_8 = "utf-8";

    private  ReportHelper(){}

    public static final String TARGET_EXTENT_REPORT = "target/extent";

    public static void configureReport() {
        File reportFolder = new File(TARGET_EXTENT_REPORT);
        if(!reportFolder.exists())
            reportFolder.mkdir();

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(TARGET_EXTENT_REPORT+"/report.html");
        htmlReporter.config().setAutoCreateRelativePathMedia(true);
        htmlReporter.config().setCSS("css-string");
        htmlReporter.config().setDocumentTitle("Report-BackEnd-Test");
        htmlReporter.config().setEncoding(UTF_8);
        htmlReporter.config().setJS("js-string");
        htmlReporter.config().setProtocol(Protocol.HTTPS);
        htmlReporter.config().setReportName("Reporte Test BackEnd - Cooperação Solidária");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");

        ExtentService.getInstance().attachReporter(htmlReporter);
    }

    private static File getTheNewestFile(String filePath, String ext) {
        File theNewestFile = null;
        File dir = new File(filePath);
        FileFilter fileFilter = new WildcardFileFilter("*." + ext);
        File[] files = dir.listFiles(fileFilter);

        if (files.length > 0) {
            /** The newest file comes first **/
            Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
            theNewestFile = files[0];
        }

        return theNewestFile;
    }

    public static void updateReport() throws IOException {
        File theNewestFile = getTheNewestFile(TARGET_EXTENT_REPORT, "html");
        String htmlContent = FileUtils.readFileToString(theNewestFile, UTF_8);

        String pattern = "href='([^'].*)' data-featherlight";

        Pattern r = Pattern.compile(pattern);
        Matcher matcher = r.matcher(htmlContent);

        Set<String> keyList = new HashSet();

        while (matcher.find()) {
            keyList.add(matcher.group(1));
        }
        for (String data : keyList) {
            String oldString = data + "' data-featherlight='image'>";
            htmlContent = htmlContent.replace(oldString, oldString + "<img src='" + data + "' style=\"width:150px\">");
        }
        htmlContent = htmlContent.replace("<span class='label grey badge white-text text-white'>base64-img</span>", "");

        FileUtils.writeStringToFile(theNewestFile, htmlContent, UTF_8);
    }

}
