package com.eontecnologia.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eontecnologia.dslist.dto.GameListDTO;
import com.eontecnologia.dslist.entit‭ies.GameList;
import com.eontecnologia.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired 
	private GameListRepository gameListRepository;
	
	@Transactional
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
	@Transactional
	public GameListDTO findById(Long id) {
		GameList result = gameListRepository.findById(id).get();
		return new GameListDTO(result);
	}
}
