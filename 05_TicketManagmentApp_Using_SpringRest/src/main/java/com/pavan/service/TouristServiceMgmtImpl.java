package com.pavan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.dao.ITouristRepo;
import com.pavan.exception.TouristNotFoundException;
import com.pavan.model.Tourist;

@Service
public class TouristServiceMgmtImpl implements ITouristMgmtService {

	@Autowired
	private ITouristRepo repo;

	@Override
	public String RegisterTourist(Tourist tourist) {
		Tourist t = repo.save(tourist);
		return "Tourist Registerd with the id :: " + t.getTid();
	}

	@Override
	public List<Tourist> findAllTourist() {
		List<Tourist> list = (List<Tourist>) repo.findAll();

		list.sort((t1, t2) -> t1.getTid().compareTo(t2.getTid()));
		return list;
	}

	@Override
	public Tourist fetchTouristById(Integer id) {

		/*
		 * Optional<Tourist> optional = repo.findById(id);
		 * 
		 * if (optional.isPresent()) { return optional.get();
		 * 
		 * } else { throw new
		 * TouristNotFoundException("Tourist Not found with the given id : " + id); }
		 */

		return repo.findById(id)
				.orElseThrow(() -> new TouristNotFoundException("Tourist Not found with the given id : " + id));

	}

	@Override
	public String updateTouristByDetails(Tourist t) {
		Optional<Tourist> optional = repo.findById(t.getTid());
		if (optional.isPresent()) {
			repo.save(t);
			return "Tourist with the id ::" + t.getTid() + " updated";
		} else {
			throw new TouristNotFoundException("tourist with the id:: " + t.getTid() + " not available for updation");
		}
	}

	@Override
	public String updateTouristById(Integer id) {
		return null;
	}

	@Override
	public String DeleteTouristById(Integer id) {
		return null;
	}

}
