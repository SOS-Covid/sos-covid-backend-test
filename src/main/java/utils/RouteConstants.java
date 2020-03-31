package utils;

public class RouteConstants {

    public static final String URL = "http://sos-covid-backend.herokuapp.com";

    public static final String REGISTER_USER = "/user/register";
    public static final String GET_CONTRIBUIDOR = "/user/find/contributor";
    public static final String GET_ORGANIZACAO = "/user/find/organization";
    public static final String GET_ORGANIZACAO_ALL = "/user/find/organization/all";
    public static final String GET_GENERICO = "/user/find";
    public static final String POST_SESSION = "session";
    public static final String PATCH_NEW_PASSWORD = "/user/password";
    public static final String GET_ACTIVE_USER = "/user/active";
    public static final String REGISTER_CAMPANHA = "/campaign/create";
    public static final String DELETE_CAMPANHA = "/campaign/remove/";
    public static final String DELETE_USER = "/user/remove/";
    public static final String GET_CAMPANHA_PAGINADA = "/campaign/find";
    public static final String GET_CAMPANHA_ALL = "/campaign/find/all";
    public static final String GET_CAMPANHA_BY_MAIL = "/campaign/find/";
}
