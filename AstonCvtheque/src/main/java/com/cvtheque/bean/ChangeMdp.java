package com.cvtheque.bean;

public class ChangeMdp {


	private String oldPassword;
	private String newPassword;
	private String confirmPassword;
	
	public ChangeMdp(){
		this(null, null, null);
	}
	public ChangeMdp(String ancienMotDePasse, String nouveauMotDePasse, String confirmationMotDePasse) {
	
		this.setOldPassword(ancienMotDePasse);
		this.setNewPassword(nouveauMotDePasse);
		this.setConfirmPassword(confirmationMotDePasse);
	}
	


	
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {

		StringBuffer buff = new StringBuffer();
		buff.append(this.getClass().getSimpleName());
		buff.append("[");
		buff.append(this.getOldPassword());
		buff.append(",");
		buff.append(this.getNewPassword());
		buff.append(",");
		buff.append(this.getConfirmPassword());
		buff.append("]");
		return buff.toString();

	}
	
}
