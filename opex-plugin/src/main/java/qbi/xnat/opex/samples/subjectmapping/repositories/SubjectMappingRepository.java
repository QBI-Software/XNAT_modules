package qbi.xnat.opex.samples.subjectmapping.repositories;

import org.nrg.framework.orm.hibernate.AbstractHibernateDAO;
import qbi.xnat.opex.samples.subjectmapping.entities.SubjectMapping;
import org.springframework.stereotype.Repository;

@Repository
public class SubjectMappingRepository extends AbstractHibernateDAO<SubjectMapping> {
}
