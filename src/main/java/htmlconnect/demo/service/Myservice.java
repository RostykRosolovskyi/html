package htmlconnect.demo.service;


import htmlconnect.demo.module.Worker;
import htmlconnect.demo.repository.Myrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Myservice {
    @Autowired
   private Myrepository myrepository;
    public Worker getWorker(Long id)
    {
     return myrepository.findById(id).get();
    }
    public void saveModel(Worker worker)
    {
        myrepository.save(worker);
    }
}
