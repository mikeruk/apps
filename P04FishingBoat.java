package tema07ConditStatAdvUpr;

import java.util.Scanner;

public class P04FishingBoat {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		double priceSpring = 3000;
		double priceSummer = 4200;
		double priceWinter = 2600;
		double priceAutumn = 4200;
		
		
		double budget = Integer.parseInt(scanner.nextLine());
		String season = scanner.nextLine();
		int fishermen = Integer.parseInt(scanner.nextLine());
		
		switch(season) {
		
			case "Spring":
				if(fishermen <= 6) {
					priceSpring = priceSpring * 0.90;
					if(fishermen % 2 == 0) {
						priceSpring = priceSpring * 0.95;
						if(priceSpring <= budget) {
							System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceSpring - budget));
						} else {
								System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceSpring - budget));
							}
						} else {
						if(priceSpring <= budget) {
							System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceSpring - budget));
						}
							else {
								System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceSpring - budget));
							}
						}
					} else if(fishermen > 7 && fishermen <= 11) {
						priceSpring = priceSpring * 0.85;
					if(fishermen % 2 == 0) {
						priceSpring = priceSpring * 0.95;
						if(priceSpring <= budget) {
							System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceSpring - budget));
						}else {
								System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceSpring - budget));
							}
					} else {
						if(priceSpring <= budget) {
							System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceSpring - budget));
						}else {
								System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceSpring - budget));
							}
					}
				} else if(fishermen > 11) {
					priceSpring = priceSpring * 0.75;
					if(fishermen % 2 == 0) {
						priceSpring = priceSpring * 0.95;
						if(priceSpring <= budget) {
							System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceSpring - budget));
						}else {
								System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceSpring - budget));
							}
					} else {
						if(priceSpring <= budget) {
							System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceSpring - budget));
						}else {
								System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceSpring - budget));
							}
					}
				} 
				break;
			case "Summer":
				if(fishermen <= 6) {
					priceSummer = priceSummer * 0.90;
					if(fishermen % 2 == 0) {
						priceSummer = priceSummer * 0.95;
						if(priceSummer <= budget) {
							System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceSummer - budget));
						} else {
								System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceSummer - budget));
							}
						} else {
						if(priceSummer <= budget) {
							System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceSummer - budget));
						}
							else {
								System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceSummer - budget));
							}
						}
					} else if(fishermen > 7 && fishermen <= 11) {
					priceSummer = priceSummer * 0.85;
					if(fishermen % 2 == 0) {
						priceSummer = priceSummer * 0.95;
						if(priceSummer <= budget) {
							System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceSummer - budget));
						}else {
								System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceSummer - budget));
							}
					} else {
						if(priceSummer <= budget) {
							System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceSummer - budget));
						}else {
								System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceSummer - budget));
							}
					}
				} else if(fishermen > 11) {
					priceSummer = priceSummer * 0.75;
					if(fishermen % 2 == 0) {
						priceSummer = priceSummer * 0.95;
						if(priceSummer <= budget) {
							System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceSummer - budget));
						}else {
								System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceSummer - budget));
							}
					} else {
						if(priceSummer <= budget) {
							System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceSummer - budget));
						}else {
								System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceSummer - budget));
							}
					}
				} 
				break;
			case "Autumn":
				if(fishermen <= 6) {
					priceAutumn = priceAutumn * 0.90;
					if(priceAutumn <= budget) {
						System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceAutumn - budget));
					} else {
						System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceAutumn - budget));
					}
				} else if(fishermen > 7 && fishermen <= 11) {
					priceAutumn = priceAutumn * 0.85;
					if(priceAutumn < budget) {
						System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceAutumn - budget));
					} else {
						System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceAutumn - budget));
					}
				} else if(fishermen > 11) {
					priceAutumn = priceAutumn * 0.75;
					if(priceAutumn < budget) {
						System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceAutumn - budget));
					} else {
						System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceAutumn - budget));
					}
				} 
				break;
		case "Winter":
			if(fishermen <= 6) {
				priceWinter = priceWinter * 0.90;
				if(fishermen % 2 == 0) {
					priceWinter = priceWinter * 0.95;
					if(priceWinter <= budget) {
						System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceWinter - budget));
					} else {
							System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceWinter - budget));
						}
					} else {
					if(priceWinter <= budget) {
						System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceWinter - budget));
					}
						else {
							System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceWinter - budget));
						}
					}
				} else if(fishermen > 7 && fishermen <= 11) {
					priceWinter = priceWinter * 0.85;
				if(fishermen % 2 == 0) {
					priceWinter = priceWinter * 0.95;
					if(priceWinter <= budget) {
						System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceWinter - budget));
					}else {
							System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceWinter - budget));
						}
				} else {
					if(priceWinter <= budget) {
						System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceWinter - budget));
					}else {
							System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceWinter - budget));
						}
				}
			} else if(fishermen > 11) {
				priceWinter = priceWinter * 0.75;
				if(fishermen % 2 == 0) {
					priceWinter = priceWinter * 0.95;
					if(priceWinter <= budget) {
						System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceWinter - budget));
					}else {
							System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceWinter - budget));
						}
				} else {
					if(priceWinter <= budget) {
						System.out.printf("Yes! You have %.2f leva left.", Math.abs(priceWinter - budget));
					}else {
							System.out.printf("Not enough money! You need %.2f leva.", Math.abs(priceWinter - budget));
						}
				}
			} 
			break;


		}
		
	}

}
