package com.example.NewCrudOne.service;

import com.example.NewCrudOne.domain.Video;
import com.example.NewCrudOne.repository.RepositoryVideo;
import lombok.AllArgsConstructor;
//import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class VideoService {


    RepositoryVideo repository;

    public List<Video> getALL(){
       return repository.findAll();
    }

    public Video getId(@PathVariable Long id){
        return repository.findById(id).get();
    }

    public Video atualiza(@PathVariable Long id, @RequestBody Video videoNovo){
         Video videoAtual = repository.findById(id).get();
       BeanUtils.copyProperties(videoAtual, videoNovo, "id");
        return repository.save(videoAtual);
    }



    public Video creatOne(@RequestBody Video video){
        return repository.save(video);
    }

    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }

    public Video atualiza(Video videoNovo, Long id) {
        Video videoAtual = repository.findById(id).get();
        BeanUtils.copyProperties(videoAtual,videoNovo, "id");
        return repository.save(videoAtual);
    }
}
