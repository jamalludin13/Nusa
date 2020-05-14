package item_distri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class itemService {
	
	@Autowired
	private itemRepository repo;
	
	 public List<itemDistributor> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(itemDistributor itemdistributor) {
	        repo.save(itemdistibutor);
	    }
	     
	    public itemDistributor get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }
	}

