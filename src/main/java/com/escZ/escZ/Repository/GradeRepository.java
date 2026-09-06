package com.escZ.escZ.Repository;

import com.escZ.escZ.Model.Entity.Enum.GradeEnum;
import com.escZ.escZ.Model.Entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {

    Optional<Grade> findByGrade(GradeEnum gradeEnum);

}
