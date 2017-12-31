package asssociation;

public	class Address {
		String line1, line2;
		String district;
		public Address() {
		}
		public Address(String line1, String line2, String district) {
			this.line1 = line1;
			this.line2 = line2;
			this.district = district;
		}
		void msg() {
			System.out.println("inside smg");
		}
		
	}

