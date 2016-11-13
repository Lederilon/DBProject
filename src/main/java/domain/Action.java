package domain;

import java.util.Date;

/**
 * Created by kosty on 11/7/2016.
 */
public class Action {
    private Date actionDate;
    private Order actionTarget;
    private ActionType type;
    private OfferState state;
    private Profile actor;


    public Action(Date actionDate, Order actionTarget, ActionType type, OfferState state, Profile actor) {
        this.actionDate = actionDate;
        this.actionTarget = actionTarget;
        this.type = type;
        this.state = state;
        this.actor = actor;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public Order getActionTarget() {
        return actionTarget;
    }

    public void setActionTarget(Order actionTarget) {
        this.actionTarget = actionTarget;
    }

    public ActionType getType() {
        return type;
    }

    public void setType(ActionType type) {
        this.type = type;
    }

    public OfferState getState() {
        return state;
    }

    public void setState(OfferState state) {
        this.state = state;
    }

    public Profile getActor() {
        return actor;
    }

    public void setActor(Profile actor) {
        this.actor = actor;
    }
}
