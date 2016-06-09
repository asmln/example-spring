package asmln.examples.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * Created on 09.06.16.
 * Parrot. Repeats text.
 */
@RestController
public class ParrotController {

    private ParrotService parrotService;

    @Autowired
    public ParrotController(@Qualifier("clearlyParrot") ParrotService parrotService) {
        this.parrotService = parrotService;
    }

    @RequestMapping(value = "/parrot", method = RequestMethod.POST)
    @ResponseBody
    String say(@RequestParam("text") String text) {
        return parrotService.request(text);
    }
}
