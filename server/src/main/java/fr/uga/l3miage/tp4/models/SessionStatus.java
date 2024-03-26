package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;


public enum SessionStatus {
    CREATED,
    VALIDATED,
    EVAL_STARTED,
    EVAL_ENDED,
    CORRECTED,
    FINISHED

}
