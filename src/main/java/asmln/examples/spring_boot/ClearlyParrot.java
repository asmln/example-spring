package asmln.examples.spring_boot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created on 09.06.16.
 * Parrot with clearly repeat.
 */
@Service
@Qualifier("clearlyParrot")
public class ClearlyParrot implements ParrotService {
    @Override
    public String request(String text) {
        return text;
    }
}
