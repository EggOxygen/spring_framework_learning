package egg.lab.learning;

import egg.lab.learning.entity.SysReport;
import egg.lab.learning.mapper.SysReportMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;

@SpringBootTest
class LearningApplicationTests {

    @Autowired
    private SysReportMapper sysReportMapper;

    @Test
    void contextLoads() {
        // Insert
        SysReport sysReport = new SysReport();
        sysReport.setUserId(1L);
        sysReport.setTemperature("NORMAL");
        sysReport.setTravel(0L);
        sysReport.setPhysicalCondition("normal");
        sysReport.setRemark("emok test data1");
        sysReport.setCreateTime(new Date(System.currentTimeMillis()));
        int affRow = testInsert(sysReport);
        System.out.println(sysReport.getId());

        // Update
        sysReport.setId(1374173895501914114L); // From insert
        sysReport.setRemark("update");
        //testUpdate(sysReport);

        // Delete
        testDelete(sysReport.getId());
    }

    // Test Insert
    @Test
    int testInsert(SysReport sysReport) {
        return sysReportMapper.insert(sysReport);
    }

    // Test Update
    @Test
    void testUpdate(SysReport sysReport) {
        sysReportMapper.updateById(sysReport);
    }

    // Test Delete
    @Test
    void testDelete(Long id) {
        sysReportMapper.deleteById(id);
    }

}
