package kbkz.hwd.mapper;

import java.util.List;
import kbkz.hwd.mo.HwdHelloworldMo;
import org.apache.ibatis.annotations.Mapper;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface HwdHelloworldMapper extends MybatisBaseMapper<HwdHelloworldMo, Long> {
    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(HwdHelloworldMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(HwdHelloworldMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    HwdHelloworldMo selectByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(HwdHelloworldMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeyWithBLOBs(HwdHelloworldMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<HwdHelloworldMo> selectAll();

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<HwdHelloworldMo> selectSelective(HwdHelloworldMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(HwdHelloworldMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int countSelective(HwdHelloworldMo record);
}