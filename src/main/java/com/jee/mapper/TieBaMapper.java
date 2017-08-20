package com.jee.mapper;


import com.jee.po.TieBa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TieBaMapper {

    /**
     * 获取指定贴吧名字的贴吧列表
     */
    List<TieBa> getTieBaList(String title);

    /**
     * 获取所有贴吧列表
     */
    List<TieBa> getTieBaList();

    /**
     * 根据id返回指定贴吧
     */
    TieBa getTieBa(long id);

    /**
     * 新增贴吧
     */
    int insertTieba(TieBa tieBa);

    /**
     * 删除贴吧
     */
    int deleteTieba(long id);
}
