package net.onebean.kepler.dao;
import net.onebean.core.BaseDao;
import net.onebean.kepler.model.DicDictionary;
import org.apache.ibatis.annotations.Param;

public interface DicDictionaryDao extends BaseDao<DicDictionary> {
    /**
     * 根据code  查询组下一个排序值
     * @param code
     * @return
     */
    Integer findGroupOrderNextNum(@Param("code")String code);
}