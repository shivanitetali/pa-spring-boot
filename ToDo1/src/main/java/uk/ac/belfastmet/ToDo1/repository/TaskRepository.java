package uk.ac.belfastmet.ToDo1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.ToDo1.domain.ToDo1;
import uk.ac.belfastmet.ToDo1.repository.TaskRepository;

@Repository
//CRUD=Create Replace Update Delete, it connects to database task table works as per the sql queries
public interface TaskRepository extends CrudRepository<ToDo1, Long>
{
	
}
