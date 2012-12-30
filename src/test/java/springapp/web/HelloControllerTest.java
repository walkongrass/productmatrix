package springapp.web;

import junit.framework.TestCase;

import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: lizhu.zhanglz
 * Date: 12-12-30
 * Time: 下午3:40
 * To change this template use File | Settings | File Templates.
 */
public class HelloControllerTest extends TestCase {

    public void testHandleRequestView() throws Exception{
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
    }
}
