package com.escZ.escZ.Service.Impl;

import com.escZ.escZ.Model.Entity.Enum.GradeEnum;
import com.escZ.escZ.Model.Entity.Grade;
import com.escZ.escZ.Repository.GradeRepository;
import com.escZ.escZ.Service.GradeService;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {

    private final GradeRepository gradeRepository;

    public GradeServiceImpl(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    @Override
    public Grade findGradeByName(GradeEnum gradeEnum) {
        return gradeRepository
                .findByGrade(gradeEnum)
                .orElse(null);
    }




}
