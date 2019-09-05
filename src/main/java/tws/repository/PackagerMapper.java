package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Packager;

import java.util.List;

@Mapper
public interface PackagerMapper {
    List<Packager> selectAll();
    void insert(@Param("packager") Packager packager);
    void update(@Param("id") String id,@Param("getTime") String getTime);
}
