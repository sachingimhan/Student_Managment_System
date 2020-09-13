/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.Entity;

/**
 *
 * @author User
 */
public class ClassRoomEntity {
    private String roomId;
    private String roomName;

    public ClassRoomEntity() {
    }

    public ClassRoomEntity(String roomId, String roomName) {
        this.roomId = roomId;
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "ClassRoomEntity{" + "roomId=" + roomId + ", roomName=" + roomName + '}';
    }
    
}
