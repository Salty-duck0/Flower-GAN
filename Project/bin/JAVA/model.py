import os
import tensorflow as tf
from tensorflow import keras
from tensorflow.keras.models import Sequential, Model, load_model
from tensorflow.keras.layers import Input, Reshape, Dropout, Dense,Flatten, BatchNormalization,Activation, ZeroPadding2D,LeakyReLU,UpSampling2D, Conv2D
import matplotlib.pyplot as plt
from tensorflow.keras.optimizers import Adam
from PIL import Image
import numpy as np
DATA_PATH = "C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA"

generator = keras.models.load_model("C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA\\model.h5")

noise = tf.random.normal([12,100])
image_array = np.full((128,128,3),255, dtype=np.uint8)
generated_image = generator(noise, training=False)
generated_image = 0.5 * generated_image + 0.5
image_count = 0
for x in range(0,12):
    image_array[0:128,0:128] = generated_image[image_count] * 255
    image_count += 1
    filename = os.path.join(DATA_PATH,f"TEST{image_count}.png")
    im = Image.fromarray(image_array)
    im.save(filename)
