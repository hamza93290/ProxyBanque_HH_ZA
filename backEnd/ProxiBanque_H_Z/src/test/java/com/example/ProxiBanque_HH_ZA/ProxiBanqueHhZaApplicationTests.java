package com.example.ProxiBanque_HH_ZA;

import com.example.ProxiBanque_HH_ZA.dtos.ClientsDto;
import com.example.ProxiBanque_HH_ZA.entities.Clients;
import com.example.ProxiBanque_HH_ZA.repositories.ClientsRepository;
import com.example.ProxiBanque_HH_ZA.services.ClientsService;
import com.example.ProxiBanque_HH_ZA.services.impl.ClientsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProxiBanqueHhZaApplicationTests {

	@InjectMocks
	ClientsService clientsService;

	@Mock
	ClientsRepository clientsRepository;

//	@BeforeEach
//	public void setup() {
//		MockitoAnnotations.initMocks(this);
//	}
//
//	@Test
//	public void testSave() throws SQLException {
//		Clients c = new Clients();
//
//		//config du mock (persistance)
//		Mockito.when(clientsRepository.save(c)).thenReturn(c);
//
//		ClientsDto clientsDto = clientsService.saveClient(c);
//
//		assertEquals(c, clientsDto);
//
//		Mockito.verify(clientsRepository).save(c);
//
//	}

}































