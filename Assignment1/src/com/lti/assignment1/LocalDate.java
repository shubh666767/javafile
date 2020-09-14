package com.lti.assignment1;

public class LocalDate {

	
		private String dateofjoin;

		public LocalDate(String dateofjoin) {
			super();
			this.dateofjoin = dateofjoin;
		}

		public String getDateofjoin() {
			return dateofjoin;
		}

		public void setDateofjoin(String dateofjoin) {
			this.dateofjoin = dateofjoin;
		}

		@Override
		public String toString() {
			return "LocalDate [dateofjoin=" + dateofjoin + "]";
		}
		
		

	

}
