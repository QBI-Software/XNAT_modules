package qbi.xnat.qtab.subjectmapping.repositories;

import org.nrg.framework.orm.hibernate.AbstractHibernateDAO;
import qbi.xnat.qtab.subjectmapping.entities.SubjectMapping;
import org.springframework.stereotype.Repository;

@Repository
public class SubjectMappingRepository extends AbstractHibernateDAO<SubjectMapping> {
}
