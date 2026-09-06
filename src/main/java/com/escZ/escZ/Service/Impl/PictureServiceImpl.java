package com.escZ.escZ.Service.Impl;

import com.escZ.escZ.Repository.PictureRepository;
import com.escZ.escZ.Service.PictureService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureServiceImpl implements PictureService {

    private final PictureRepository pictureRepository;

    public PictureServiceImpl(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }


    @Override
    public List<String> findAllUrls() {
        return pictureRepository.findAllUrls();
    }
}
