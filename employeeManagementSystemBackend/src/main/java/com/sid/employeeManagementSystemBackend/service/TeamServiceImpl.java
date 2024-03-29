package com.sid.employeeManagementSystemBackend.service;

import com.sid.employeeManagementSystemBackend.entity.Team;
import com.sid.employeeManagementSystemBackend.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements ITeamService{

    @Autowired
    private TeamRepository teamRepository;


    @Override
    public Team addTeam(Team team) {
        return null;
    }

    @Override
    public List<Team> getAllTeam() {
        return null;
    }

    @Override
    public Team getTeamById(Long id) {
        return null;
    }

    @Override
    public Team updateTeam(Long id, Team team) {
        return null;
    }

    @Override
    public String deleteTeam(Long id) {
        return null;
    }
}
