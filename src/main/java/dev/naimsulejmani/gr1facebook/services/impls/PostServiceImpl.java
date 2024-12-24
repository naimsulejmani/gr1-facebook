package dev.naimsulejmani.gr1facebook.services.impls;

import dev.naimsulejmani.gr1facebook.dtos.PostDto;
import dev.naimsulejmani.gr1facebook.services.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Override
    public List<PostDto> findAll() {
        return List.of();
    }

    @Override
    public PostDto findById(Long id) {
        return null;
    }

    @Override
    public PostDto add(PostDto model) {
        return null;
    }

    @Override
    public PostDto modify(Long id, PostDto model) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
