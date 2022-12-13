package com.example.NewCrudOne.controller;

import com.example.NewCrudOne.domain.Video;
import com.example.NewCrudOne.repository.RepositoryVideo;
import com.example.NewCrudOne.service.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class VideoController {

    VideoService videoService;
    private final RepositoryVideo repositoryVideo;

    @GetMapping("/videos")
    public List<Video> getALL(){
        return videoService.getALL();
    }

    @GetMapping("/videos/{id}")
    public Video getId1(@PathVariable String id){
        return videoService.getId(Long.valueOf(id));
    }

    @PostMapping("/videos")
    public Video creat(@RequestBody Video video){
        return videoService.creatOne(video);
    }

    @PutMapping("/videos/{id}")
    public Video update(@PathVariable Long id,@RequestBody Video videoNovo){

        return videoService.atualiza(id, videoNovo);

    }



    @DeleteMapping("/videos/{id}")
    public void delete(@PathVariable Long id){
        videoService.delete(id);
    }


}
