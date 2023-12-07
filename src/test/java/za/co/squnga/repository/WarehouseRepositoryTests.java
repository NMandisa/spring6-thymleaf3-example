package za.co.squnga.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import za.co.squnga.entity.Warehouse;

/**
 * @author Noxolo.Mkhungo
 */
public class WarehouseRepositoryTests {

    @InjectMocks
    private WarehouseRepository warehouseRepository;

    // Need clean up if the MainApplication CommandLineRunner bean inserted some data
    // empty table.
    @BeforeEach
    void cleanup() {
        warehouseRepository.deleteAll();
        warehouseRepository.flush();
    }
    @Test
    public void testPrivilegeSave() {
        Warehouse w1 = new Warehouse("Warehouse A");
        warehouseRepository.save(w1);
        Long savedPrivilegeID = w1.getWarehouseId();
        Warehouse warehouse = warehouseRepository.findById(savedPrivilegeID).orElseThrow();
        Assertions.assertEquals(savedPrivilegeID, warehouse.getWarehouseId());
    }

}
