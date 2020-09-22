package br.com.edgar.vitor.easforum.controller;

import br.com.edgar.vitor.easforum.controller.dto.TopicoDto;
import br.com.edgar.vitor.easforum.modelo.Curso;
import br.com.edgar.vitor.easforum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {
        Topico topico = new Topico("Duvida", "Duvida Spring", new Curso("Spring", "Progamação"));

        return TopicoDto.converter(Arrays.asList(topico,topico,topico));
    }
}
