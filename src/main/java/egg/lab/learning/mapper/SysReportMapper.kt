package egg.lab.learning.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import egg.lab.learning.entity.SysReport
import org.apache.ibatis.annotations.Mapper

/**
 * SysReportMapper
 *
 */
@Mapper
interface SysReportMapper : BaseMapper<SysReport> {
}
