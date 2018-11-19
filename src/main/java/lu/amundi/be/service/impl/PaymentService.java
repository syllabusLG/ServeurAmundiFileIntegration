package lu.amundi.be.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lu.amundi.be.dao.PaymentRepository;
import lu.amundi.be.entities.Payment;
import lu.amundi.be.service.ICrudService;

/**
 * This service uses the generic interface ICrudService to implement all crud operation according to Payment
 * @author AbousyllabaNdiaye
 * @version 1.0
 *
 */
@Service
@Primary
public class PaymentService implements ICrudService<Payment, String>{

	@Autowired
	private PaymentRepository paymentRepository;
	
	@Override
	public List<Payment> getAll() {
		// TODO Auto-generated method stub
		return paymentRepository.findAll();
	}

	@Override
	public void add(Payment payment) {
		// TODO Auto-generated method stub
		paymentRepository.save(payment);
	}

	@Override
	public void update(Payment payment) {
		// TODO Auto-generated method stub
		paymentRepository.save(payment);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		Payment payment = new Payment();
		payment.setBic(id);
		paymentRepository.delete(payment);
	}

	@Override
	public void saveAll(Iterable<Payment> iterable) {
		paymentRepository.saveAll(iterable);
	}

	@Override
	public Optional<Payment> findOne(String id) {
		return paymentRepository.findById(id);
	}

	@Override
	public Page<Payment> search(String mc, Pageable pageable) {
		// TODO Auto-generated method stub
		return paymentRepository.chercher(mc, pageable);
	}

}
