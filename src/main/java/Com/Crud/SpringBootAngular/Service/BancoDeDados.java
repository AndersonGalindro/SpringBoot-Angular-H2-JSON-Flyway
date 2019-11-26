package Com.Crud.SpringBootAngular.Service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Com.Crud.SpringBootAngular.Model.AvisosModel;

@Repository
public interface BancoDeDados extends JpaRepository<AvisosModel, Integer>{

}
