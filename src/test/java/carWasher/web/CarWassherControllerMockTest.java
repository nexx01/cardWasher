package carWasher.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.web.servlet.ModelAndView;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class CarWassherControllerMockTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getCars() throws Exception {
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/carWasherController/car");

        ResultActions perform = mockMvc.perform(mockHttpServletRequestBuilder);
        MvcResult mvcResult = perform.andReturn();

        perform.andDo(MockMvcResultHandlers.print());

        ModelAndView modelAndView = mvcResult.getModelAndView();

        System.out.println("View name is : " + modelAndView.getViewName());
        System.out.println("Status is : " + modelAndView.getStatus());
    }


}
