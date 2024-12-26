package dev.naimsulejmani.gr1facebook.controllers.api.v1;

import dev.naimsulejmani.gr1facebook.dtos.PostDto;
import dev.naimsulejmani.gr1facebook.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// ish dsath -> /api/v1/users/{userId}/posts
@RequestMapping("/api/v1/posts")
@RequiredArgsConstructor
public class PostRestController {
    private final PostService service;

    @GetMapping
    public List<PostDto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public PostDto findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    public PostDto add(@RequestBody PostDto model) {
        return service.add(model);
    }

    @PutMapping("/{id}")
    public PostDto modify(@PathVariable long id, @RequestBody PostDto model) {
        return service.modify(id, model);
    }

    @DeleteMapping("/{id}")
    public void removeById(@PathVariable long id) {
        service.removeById(id);
    }

}













