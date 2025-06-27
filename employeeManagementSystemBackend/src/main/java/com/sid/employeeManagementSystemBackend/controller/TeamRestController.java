package com.sid.employeeManagementSystemBackend.controller;


import com.sid.employeeManagementSystemBackend.entity.Team;
import com.sid.employeeManagementSystemBackend.service.TeamServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/team/")
@RestController
@Tag(name = "Team", description = "Team Operations")
public class TeamRestController {

    @Autowired
    private TeamServiceImpl teamService;

    @Operation(
            summary = "Create a new team",
            description = "Creates a team with a name, description, and an optional list of employees.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Team created successfully"),
                    @ApiResponse(responseCode = "400", description = "Invalid request data")
            }
    )

    @PostMapping("addTeam")
    public Team addTeam(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Team data to be created",
                    required = true,
                    content = @Content(
                            schema = @Schema(implementation = Team.class),
                            examples = @ExampleObject(
                                    value = """
                    {
                      "name": "Marketing Team",
                      "description": "Handles marketing campaigns",
                      "employeeList": []
                    }
                    """
                            )
                    )
            )
            @RequestBody Team team
    ) {
        return teamService.addTeam(team);
    }
    @GetMapping("getTeam")
    @Operation(summary = "Get All team")
    public List<Team> getAllTeam(){
        return teamService.getAllTeam();
    }

    @Operation(summary = "retreive a team by id")
    @GetMapping("getTeamById")
    public Team getTeamById(Long id){
        return teamService.getTeamById(id);
    }

    @Operation(summary = "update a  specific team")
    @PutMapping("updateTeam/{id}")
    public Team updateTeam(@PathVariable("id")Long id,@RequestBody Team team){
        return  teamService.updateTeam(id,team);
    }

    @Operation(summary = "delete a  specific team")
    @DeleteMapping("deleteTeam/{id}")
    public String deleteTeam(@PathVariable("id") Long id){
        return teamService.deleteTeam(id);
    }


}
