package com.kantar.lookup.application.lookupapplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Lookup {

		@Id
        private int panelistId;
        private int householdId;
        private String userName;
        private String recruitedBy;
        private String optinStatus;
        private Boolean panelistStatus;
        private String role;
        private String local;
        private String currentOwner;
        
		public int getPanelistId() {
			return panelistId;
		}
		public void setPanelistId(int panelistId) {
			this.panelistId = panelistId;
		}
		public int getHouseholdId() {
			return householdId;
		}
		public void setHouseholdId(int householdId) {
			this.householdId = householdId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getRecruitedBy() {
			return recruitedBy;
		}
		public void setRecruitedBy(String recruitedBy) {
			this.recruitedBy = recruitedBy;
		}
		public String getOptinStatus() {
			return optinStatus;
		}
		public void setOptinStatus(String optinStatus) {
			this.optinStatus = optinStatus;
		}
		public Boolean getPanelistStatus() {
			return panelistStatus;
		}
		public void setPanelistStatus(Boolean panelistStatus) {
			this.panelistStatus = panelistStatus;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getLocal() {
			return local;
		}
		public void setLocal(String local) {
			this.local = local;
		}
		public String getCurrentOwner() {
			return currentOwner;
		}
		public void setCurrentOwner(String currentOwner) {
			this.currentOwner = currentOwner;
		}
		
}
