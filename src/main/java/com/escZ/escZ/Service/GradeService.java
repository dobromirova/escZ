package com.escZ.escZ.Service;

import com.escZ.escZ.Model.Entity.Enum.GradeEnum;
import com.escZ.escZ.Model.Entity.Grade;

public interface GradeService {

    Grade findGradeByName(GradeEnum gradeEnum);


}
