package com.eontecnologia.dslist.dto;

import com.eontecnologia.dslist.entit‭ies.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	public GameListDTO() {
		
	}
	
	public GameListDTO(GameList gameList) {
		
		//BeanUtils.copyProperties(gameList, this);
		id = gameList.getId();
		name = gameList.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
