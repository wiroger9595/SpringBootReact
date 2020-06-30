package io.agileintelligence.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.agileintelligence.ppmtool.domain.Project;
import io.agileintelligence.ppmtool.exceptions.ExceptionProject;
import io.agileintelligence.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		
		try {
			return projectRepository.save(project);
		}catch(Exception e) {
			throw new ExceptionProject("Project " + project.getProjectIdentifier().toUpperCase()+ " is here" );
		}
		
	}
	
	public Project searchProjectByIdentifier(String projectId) {
		return projectRepository.findByProjectIdentifier(projectId);
	}
	
	
}
