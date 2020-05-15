package gennadziy.repository;

import gennadziy.model.Planets;
import org.springframework.data.jpa.repository.JpaRepository;

/*
@Author Gennadziy GITHUB/gennadziy
Class name: PlanetDao
Date: 2020-05-13
Time: 20:30
*/

public interface  PlanetDao extends  JpaRepository<Planets, Integer> {
}
