# Select the base image
FROM node:alpine

# Copy in our source file
COPY *.* /usr/src/app/

# Set the "current working directory" inside the container (think of it like using the CD command to change directories)
WORKDIR /usr/src/app/

EXPOSE 3000

# Set the default command to be executed when container is started from this image
CMD ["npm", "start"]
