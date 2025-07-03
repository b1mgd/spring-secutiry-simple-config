package academy.itk.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Использую стабы в методах, т.к. по условию реализация сервисов и репозиториев не требуется
 */
@RestController
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "Домашняя страница";
    }

    @GetMapping("/private")
    public String privateArea() {
        return "Приватная страница, требующая аутентификации";
    }
}
