package fr.inria.kairos.sock.dsl.example.butterfly;

import java.util.List;

import fr.inria.kairos.sock.dsl.example.butterfly.utils.IOUtils;

public class DCMotor {
	
	public final static DCMotor instance = new DCMotor();
	
	public DCMotor() {
	}
	
	public void accelerate(int time) {
		final List<String> orders = IOUtils.readFile("order");
		final int lastOrder = IOUtils.get(orders, 2, 1);
		final int currentOrder = IOUtils.get(orders, 1 ,1);
		final List<String> speeds = IOUtils.readFile("speed");
		final int lastSpeed = IOUtils.get(speeds, 1, 1);
		int lastTime = IOUtils.get(speeds, 1, 0);
		int currentSpeed = lastSpeed;
		int indexLastOrder = VehiculPositionning.ACCELERATION.indexOf(
				lastOrder < 0 ? lastOrder * -1 : lastOrder
		);
		int indexCurrentOrder = VehiculPositionning.ACCELERATION.indexOf(
				currentOrder < 0 ? currentOrder * -1 : currentOrder
		);
		int currentIndexAcceleration = indexLastOrder;
		int signOfCurrentOrder =  currentOrder < 0 ? -1 : 1;
		if (lastOrder * currentOrder < 0) {
			for (int i = indexLastOrder ; i != indexCurrentOrder ;) {
				lastTime++;
				int currentAcceleration = VehiculPositionning.ACCELERATION.get(i);
				currentSpeed += currentAcceleration * signOfCurrentOrder;
				IOUtils.write(lastTime, currentSpeed + " " + currentAcceleration * signOfCurrentOrder, "speed");
				if (lastTime % 2 == 0) {
					 i = i + signOfCurrentOrder;
				}
			}
			for (int i = lastTime + 1; i < time ; i++ ) {
				int currentAcceleration = VehiculPositionning.ACCELERATION.get(indexCurrentOrder);
				currentSpeed += currentAcceleration * signOfCurrentOrder;
				IOUtils.write(i, currentSpeed + " " + currentAcceleration * signOfCurrentOrder, "speed");
			}
			// it means that we change the sign of the order
			// TODO implement
		} else {
			for (int i = lastTime + 1; i < time ; i++ ) {
				int currentAcceleration = VehiculPositionning.ACCELERATION.get(currentIndexAcceleration);
				currentSpeed += currentAcceleration * signOfCurrentOrder;
				IOUtils.write(i, currentSpeed + "", "speed");
				if (i % 2 == 0) {
					if (currentIndexAcceleration < indexCurrentOrder) {
						currentIndexAcceleration++;
					} else if (currentIndexAcceleration > indexCurrentOrder) {
						currentIndexAcceleration--;
					}
				}
			}
		}
	}

}
