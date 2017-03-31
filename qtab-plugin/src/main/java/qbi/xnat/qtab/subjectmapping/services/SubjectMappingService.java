package qbi.xnat.qtab.subjectmapping.services;

import org.nrg.framework.orm.hibernate.BaseHibernateService;
import qbi.xnat.qtab.subjectmapping.entities.SubjectMapping;

import java.util.List;

public interface SubjectMappingService extends BaseHibernateService<SubjectMapping> {
    /**
     * Finds the subject with the indicated {@link SubjectMapping#getSubjectId() subject ID}.
     *
     * @param subjectId The subject ID.
     *
     * @return The subject with the indicated ID, null if not found.
     */
    SubjectMapping findBySubjectId(final String subjectId);

    /**
     * Finds the subject with the indicated {@link SubjectMapping#getRecordId()} record ID} in the specified {@link
     * SubjectMapping#getSource() source system}.
     *
     * @param recordId The subject ID.
     * @param source   The ID of the source system.
     *
     * @return The subject with the indicated record ID in the specified source system, null if not found.
     */
    SubjectMapping findByRecordId(final String recordId, final String source);

    /**
     * Finds all subjects in the indicated {@link SubjectMapping#getSource() source system}.
     *
     * @param source The ID of the source system.
     *
     * @return All subjects from the indicated source system.
     */
    List<SubjectMapping> findBySource(final String source);
}
