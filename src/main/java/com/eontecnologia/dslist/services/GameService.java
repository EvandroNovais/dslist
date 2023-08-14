package com.eontecnologia.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eontecnologia.dslist.dto.GameDTO;
import com.eontecnologia.dslist.dto.GameMinDTO;
import com.eontecnologia.dslist.entit‭ies.Game;
import com.eontecnologia.dslist.repositories.GameRepository;

@Service //or @Component
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){		
		
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);		
	}
}
