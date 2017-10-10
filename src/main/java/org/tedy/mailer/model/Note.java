package org.tedy.mailer.model;

/**
 * Created by tedy on 18/1/17.
 */
public class Note {
    private int note_id;
    private String created_at;
    private String created_by;
    private String note;

    public int getNote_id() {
        return note_id;
    }
    public void setNote_id(int note_id) {
        this.note_id = note_id;
    }

    public String getCreated_at() {
        return created_at;
    }
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getCreated_by() {
        return created_by;
    }
    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
}