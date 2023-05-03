package com.cjc.main.servicei;

import com.cjc.main.model.Admission;

public interface Servicei {

	Admission save(Admission admission);

	Iterable<Admission> get();

	void delete(Integer sid);

	Admission update(Admission admission, Integer sid);

}
