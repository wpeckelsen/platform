package nl.wessel.platform.A.Controller;
import nl.wessel.platform.B.BusinessLogic.DTO.Deal.CreateDeal;
import nl.wessel.platform.B.BusinessLogic.DTO.Deal.CreatedDeal;
import nl.wessel.platform.B.BusinessLogic.Service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/deal")
public class DealContr {
    
    @Autowired
    DealService dealService;



    //    CREATE
    @PostMapping("/new")
    public ResponseEntity<CreatedDeal> newDeal(@RequestBody CreateDeal deal) {
        final CreatedDeal createdDeal = dealService.newDeal(deal);
        return ResponseEntity.ok().body(createdDeal);
    }


    //    READ
    @GetMapping("/list")
    public ResponseEntity<List<CreatedDeal>> getList() {
        List<CreatedDeal> createdDealList;
        createdDealList = dealService.getList();
        return ResponseEntity.ok().body(createdDealList);
    }

    @GetMapping("/{dealID}")
    public ResponseEntity<CreatedDeal> getByID(@PathVariable("dealID") Long dealID) {
        CreatedDeal createdDeal = dealService.getByID(dealID);
        return ResponseEntity.ok().body(createdDeal);
    }


    //    update
    @PutMapping("/update/{dealID}")
    public ResponseEntity<Object> update(@PathVariable Long dealID, @RequestBody CreateDeal createDeal) {
        CreatedDeal createdDeal = dealService.update(dealID, createDeal);
        return ResponseEntity.ok().body(createdDeal);
    }


    //    delete
    @DeleteMapping("/delete/{dealID}")
    public ResponseEntity<Object> deleteById(@PathVariable Long dealID) {
        dealService.deleteById(dealID);
        return ResponseEntity.noContent().build();
    }
}
