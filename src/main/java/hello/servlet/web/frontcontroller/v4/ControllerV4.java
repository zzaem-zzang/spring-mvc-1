package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

public interface ControllerV4 {
    /**
     *
     * @param parseMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> parseMap, Map<String, Object> model);
}
